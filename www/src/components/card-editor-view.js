import React, { useEffect, useMemo, useState } from 'react'
import WorkspaceUtils from '../lib/workspace-utils'
import styles from './card-editor-view.module.css'
import ReactBlocklyComponent from 'react-blockly'
import Blockly from 'blockly'
import isArray from 'lodash/isArray'
import { Form } from 'react-bootstrap'
import { useIndex } from '../hooks/use-index'
import BlocklyMiscUtils, { createCard, generateCard, getToolboxCategories } from '../lib/blockly-misc-utils'
import useComponentWillMount from '../hooks/use-component-will-mount'
import useBlocklyData from '../hooks/use-blockly-data'

const CardEditorView = () => {
  const data = useBlocklyData()

  const heroClassColors = useMemo(() => BlocklyMiscUtils.getHeroClassColors(data))
  const [code, setCode] = useState(``)
  const [query, setQuery] = useState(``)
  const [checked, setChecked] = useState(false)
  const [results, setResults] = useState([])
  const index = useIndex()

  // Run once before the workspace has been created
  useComponentWillMount(() => {
    BlocklyMiscUtils.initializeBlocks(data)
  })

  // Run once after the workspace has been created
  useEffect(() => {
    const workspace = Blockly.getMainWorkspace()
    const importCardCallback = () => {
      generateCard(data, Blockly.getMainWorkspace(), prompt('Input the name of the card (or the wiki page URL / Card ID for more precision)'))
      workspace.getToolbox().clearSelection()
      setToolboxCategories(getToolboxCategories(null, data, toolboxCategories, results))
    }
    workspace.registerButtonCallback('importCard', importCardCallback)
    const changeListenerCallback = (event) => {
      if (event.type === Blockly.Events.UI && event.element === 'category') {
        if (event.newValue === 'Targets') {
          // TODO: change listener callback work
        }
      }
    }
    workspace.addChangeListener(changeListenerCallback)
    return () => {
      workspace.removeButtonCallback('importCard')
      workspace.removeChangeListener(changeListenerCallback)
    }
  }, [])

  const [toolboxCategories, setToolboxCategories] = useState(getToolboxCategories(null, data, toolboxCategories, results))

  function onWorkspaceChanged (workspace) {
    const cardScript = WorkspaceUtils.workspaceToCardScript(workspace)
    // Generate the blocks that correspond to the cards in the workspace
    let cardsStillInUse = []
    let update = false
    if (isArray(cardScript)) {
      cardScript.forEach(card => {
        if (createCard(card, workspace, cardsStillInUse, heroClassColors)) {
          update = true
        }
      })
    } else if (createCard(cardScript, workspace, cardsStillInUse, heroClassColors)) {
      update = true
    }
    for (let blocksKey in Blockly.Blocks) {
      if (blocksKey.startsWith('WorkspaceCard') && !cardsStillInUse.includes(blocksKey)) {
        delete Blockly.Blocks[blocksKey]
        update = true
      }
    }
    setCode(JSON.stringify(cardScript, null, 2))
    if (update) {
      setToolboxCategories(getToolboxCategories('Cards', data, toolboxCategories, results))
    }
    
    if (window.vuplex) {
      window.vuplex.postMessage(cardScript)
    } else {
      window.addEventListener('vuplexready', () => window.vuplex.postMessage(cardScript))
    }
  }

  // update input value
  const updateQuery = event => {
    setQuery(event.target.value)
  }

  const handleSearchResults = event => {
    if (event.target.value.length === 0) {
      setResults([])
    }
    setToolboxCategories(getToolboxCategories('Search Results', data, toolboxCategories, results))
    const workspace = Blockly.getMainWorkspace()
    if (event.target.value.length > 0) {
      workspace.getToolbox().selectFirstCategory()
      workspace.getToolbox().refreshSelection()
    } else {
      workspace.getToolbox().clearSelection()
    }
  }

  const search = evt => {
    const query = evt.target.value
    setQuery(query)
    setResults(index
        // Query the index with search string to get an [] of IDs
        .search(query, { expand: true }) // accept partial matches
        .map(({ ref }) => index.documentStore.getDoc(ref))
        .filter(doc => doc.nodeType === 'Block' || (doc.nodeType === 'Card' && checked
          && heroClassColors.hasOwnProperty(doc.heroClass) && doc.hasOwnProperty('baseManaCost')))
        .map(doc => {
          if (doc.nodeType === 'Card') {
            return {
              id: 'CatalogueCard_' + doc.id
            }
          }
          return doc
        })
        .slice(0, 20)
      // map over each ID and return full document
    )
  }

  return (<span>
    <Form inline onSubmit={(event) => event.preventDefault()}>
      <Form.Control type="text" placeholder={'Search blocks'}
                    value={query}
                    onChange={e => {
                      updateQuery(e)
                      search(e)
                      handleSearchResults(e)
                    }}
                    style={{ width: '50%' }}
      />
      <Form.Check style={{ display: 'inline' }}>
        <Form.Check.Input onChange={e => {
          setChecked(!checked)
          if (query.length > 0) {
            search({ target: { value: query } })
            handleSearchResults({ target: { value: query } })
          }
        }}
                          value={checked}
                          style={
                            {
                              height: '15px',
                              width: '15px',
                              webkitAppearance: 'checkbox'
                            }
                          }
        />
        <Form.Check.Label> Show Card Catalogue Blocks</Form.Check.Label>
      </Form.Check>
    </Form>
    <ReactBlocklyComponent.BlocklyEditor
      workspaceDidChange={onWorkspaceChanged}
      wrapperDivClassName={styles.codeEditor}
      toolboxCategories={toolboxCategories}
    />
  </span>)
}

export default CardEditorView