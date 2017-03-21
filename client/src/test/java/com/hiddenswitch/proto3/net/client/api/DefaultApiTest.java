/**
 * Hidden Switch Minionate API
 * The Minionate API for matchmaking, user accounts, collections management and more
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


package com.hiddenswitch.proto3.net.client.api;

import com.hiddenswitch.proto3.net.client.ApiException;
import com.hiddenswitch.proto3.net.client.models.CreateAccountResponse;
import com.hiddenswitch.proto3.net.client.models.CreateAccountRequest;
import com.hiddenswitch.proto3.net.client.models.DecksGetResponse;
import com.hiddenswitch.proto3.net.client.models.DecksGetAllResponse;
import com.hiddenswitch.proto3.net.client.models.DecksPutRequest;
import com.hiddenswitch.proto3.net.client.models.DecksPutResponse;
import com.hiddenswitch.proto3.net.client.models.DecksUpdateCommand;
import com.hiddenswitch.proto3.net.client.models.GetAccountsResponse;
import com.hiddenswitch.proto3.net.client.models.GetAccountsRequest;
import com.hiddenswitch.proto3.net.client.models.LoginResponse;
import com.hiddenswitch.proto3.net.client.models.LoginRequest;
import com.hiddenswitch.proto3.net.client.models.MatchCancelResponse;
import com.hiddenswitch.proto3.net.client.models.MatchmakingQueuePutResponse;
import com.hiddenswitch.proto3.net.client.models.MatchmakingQueuePutRequest;
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
     * Create an account with Minionate. 
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
     * Enters your client into a matchmaking queue for constructed deck matchmaking. Clients have to keep their matchmaking queue entry alive by regularly retrying when they have not yet been matched. Retry within 5 seconds. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void matchmakingConstructedQueuePutTest() throws ApiException {
        MatchmakingQueuePutRequest request = null;
        // MatchmakingQueuePutResponse response = api.matchmakingConstructedQueuePut(request);

        // TODO: test validations
    }
    
}
