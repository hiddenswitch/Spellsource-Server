/**
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more
 *
 * OpenAPI spec version: 1.0.1
 * Contact: benjamin.s.berman@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.hiddenswitch.spellsource.client.api;

import com.hiddenswitch.spellsource.client.ApiException;
import com.hiddenswitch.spellsource.client.models.CreateAccountResponse;
import com.hiddenswitch.spellsource.client.models.CreateAccountRequest;
import com.hiddenswitch.spellsource.client.models.SpellsourceException;
import com.hiddenswitch.spellsource.client.models.DecksGetResponse;
import com.hiddenswitch.spellsource.client.models.DecksGetAllResponse;
import com.hiddenswitch.spellsource.client.models.DecksPutRequest;
import com.hiddenswitch.spellsource.client.models.DecksPutResponse;
import com.hiddenswitch.spellsource.client.models.DecksUpdateCommand;
import com.hiddenswitch.spellsource.client.models.DraftState;
import com.hiddenswitch.spellsource.client.models.DraftsChooseCardRequest;
import com.hiddenswitch.spellsource.client.models.DraftsChooseHeroRequest;
import com.hiddenswitch.spellsource.client.models.DraftsPostRequest;
import com.hiddenswitch.spellsource.client.models.UnfriendResponse;
import com.hiddenswitch.spellsource.client.models.FriendPutResponse;
import com.hiddenswitch.spellsource.client.models.FriendPutRequest;
import com.hiddenswitch.spellsource.client.models.GetAccountsResponse;
import com.hiddenswitch.spellsource.client.models.GetAccountsRequest;
import com.hiddenswitch.spellsource.client.models.GetConversationResponse;
import com.hiddenswitch.spellsource.client.models.LoginResponse;
import com.hiddenswitch.spellsource.client.models.LoginRequest;
import com.hiddenswitch.spellsource.client.models.GameState;
import com.hiddenswitch.spellsource.client.models.MatchCancelResponse;
import com.hiddenswitch.spellsource.client.models.MatchmakingQueuePutResponse;
import com.hiddenswitch.spellsource.client.models.MatchmakingQueuePutRequest;
import com.hiddenswitch.spellsource.client.models.MatchmakingQueuesResponse;
import com.hiddenswitch.spellsource.client.models.SendMessageResponse;
import com.hiddenswitch.spellsource.client.models.SendMessageRequest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Create an account with Spellsource. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountTest() throws ApiException {
        CreateAccountRequest request = null;
        // CreateAccountResponse response = api.createAccount(request);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes the specified deck by ID. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void decksDeleteTest() throws ApiException {
        String deckId = null;
        // api.decksDelete(deckId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a deck. Only viewable for the owner of the deck or players in the alliance. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void decksGetTest() throws ApiException {
        String deckId = null;
        // DecksGetResponse response = api.decksGet(deckId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets all the user&#39;s decks. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void decksGetAllTest() throws ApiException {
        // DecksGetAllResponse response = api.decksGetAll();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a new deck with optionally specified inventory IDs, a name and a hero class. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void decksPutTest() throws ApiException {
        DecksPutRequest request = null;
        // DecksPutResponse response = api.decksPut(request);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates the deck by adding or removing cards, changing the hero class, or renaming the deck. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void decksUpdateTest() throws ApiException {
        String deckId = null;
        DecksUpdateCommand updateCommand = null;
        // DecksGetResponse response = api.decksUpdate(deckId, updateCommand);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Make a selection for the given draft index. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void draftsChooseCardTest() throws ApiException {
        DraftsChooseCardRequest request = null;
        // DraftState response = api.draftsChooseCard(request);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Choose a hero from your hero selection. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void draftsChooseHeroTest() throws ApiException {
        DraftsChooseHeroRequest request = null;
        // DraftState response = api.draftsChooseHero(request);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets your latest state of the draft. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void draftsGetTest() throws ApiException {
        // DraftState response = api.draftsGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Starts a draft, or make a change to your draft, like retiring early. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void draftsPostTest() throws ApiException {
        DraftsPostRequest request = null;
        // DraftState response = api.draftsPost(request);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * unfriend a user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void friendDeleteTest() throws ApiException {
        String friendId = null;
        // UnfriendResponse response = api.friendDelete(friendId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * connect with a friend 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void friendPutTest() throws ApiException {
        FriendPutRequest request = null;
        // FriendPutResponse response = api.friendPut(request);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a specific account. Contains more information if the userId matches the requesting user. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountTest() throws ApiException {
        String targetUserId = null;
        // GetAccountsResponse response = api.getAccount(targetUserId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of accounts including user profile information. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountsTest() throws ApiException {
        GetAccountsRequest request = null;
        // GetAccountsResponse response = api.getAccounts(request);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * get conversation with friend 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFriendConversationTest() throws ApiException {
        String friendId = null;
        // GetConversationResponse response = api.getFriendConversation(friendId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns an empty body if the server is available. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void healthCheckTest() throws ApiException {
        // api.healthCheck();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Login with a username and password, receiving an authentication token to use for future sessions. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        LoginRequest request = null;
        // LoginResponse response = api.login(request);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a renderable gamestate representing this player&#39;s current game in this queue. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void matchmakingConstructedGetTest() throws ApiException {
        String queueId = null;
        // GameState response = api.matchmakingConstructedGet(queueId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Removes your client from the matchmaking queue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void matchmakingConstructedQueueDeleteTest() throws ApiException {
        // MatchCancelResponse response = api.matchmakingConstructedQueueDelete();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Enters your client into the specified matchmaking queue. Clients have to keep their matchmaking queue entry  alive by regularly retrying when they have not yet been matched. Retry within 5 seconds. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void matchmakingConstructedQueuePutTest() throws ApiException {
        String queueId = null;
        MatchmakingQueuePutRequest request = null;
        // MatchmakingQueuePutResponse response = api.matchmakingConstructedQueuePut(queueId, request);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets a list of queues available for matchmaking. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void matchmakingGetTest() throws ApiException {
        // MatchmakingQueuesResponse response = api.matchmakingGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * send message to friend 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendFriendMessageTest() throws ApiException {
        String friendId = null;
        SendMessageRequest request = null;
        // SendMessageResponse response = api.sendFriendMessage(friendId, request);

        // TODO: test validations
    }
    
}
