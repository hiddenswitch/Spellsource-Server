const path = require(`path`)

exports.createSchemaCustomization = ({ actions }) => {
  const { createTypes } = actions
  const typeDefs = `
  type Block implements Node {
    type: String
    messages: [String]
    output: String
    colour: String
    nextStatement: [String]
    previousStatement: [String]
    args: [Args1]
    data: String
  }
  type Args1 {
    i: Int!
    args: [Args]
  }
  type Args {
    type: String
    check: String
    name: String
    valueI: Int
    valueS: String
    min: Int
    max: Int
    int: Boolean
    text: String
  }
  `
  createTypes(typeDefs)
}

exports.createPages = async ({ actions, graphql, reporter }) => {
  const { createPage } = actions

  const pageTemplate = path.resolve(`src/templates/page-template.js`)
  const cardTemplate = path.resolve(`src/templates/card-template.js`)
  const wikiTemplate = path.resolve(`src/templates/wiki-template.js`)

  const result = await graphql(`
    {
      allMarkdownRemark(
        sort: { order: DESC, fields: [frontmatter___date] }
        limit: 1000
      ) {
        edges {
          node {
            frontmatter {
              path
              layout
            }
          }
        }
      }
      
      allCard {
        edges {
          node {
            id
          }
        }
      }
    }
  `)

  // Handle errors
  if (result.errors) {
    reporter.panicOnBuild(`Error while running GraphQL query.`)
    return
  }

  // Create pages from the markdown files
  result.data.allMarkdownRemark.edges.forEach(({ node }) => {
    // Is this a wiki page? then use the wiki template
    let template = node.frontmatter.layout === 'wiki' ? wikiTemplate : pageTemplate
    createPage({
      path: node.frontmatter.path,
      component: template,
      context: {}
    })
  })

  // Create pages for each Card JSON
  result.data.allCard.edges.forEach(({ node }) => {
    createPage({
      path: '/cards/' + node.id,
      component: cardTemplate,
      context: {}
    })
  })
}