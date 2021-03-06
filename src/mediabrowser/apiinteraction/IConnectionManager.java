package mediabrowser.apiinteraction;

import mediabrowser.model.apiclient.ServerInfo;
import mediabrowser.model.connect.PinCreationResult;
import mediabrowser.model.connect.PinExchangeResult;
import mediabrowser.model.connect.PinStatusResult;
import mediabrowser.model.dto.IHasServerId;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Observable;

public interface IConnectionManager {

    ApiClient GetApiClient(IHasServerId item);

    ApiClient GetApiClient(String serverId);

    void Connect(Response<ConnectionResult> response);

    void Connect(ServerInfo server, Response<ConnectionResult> response);

    void Connect(String address, Response<ConnectionResult> response);

    void Logout(EmptyResponse response);

    Observable getConnectedObservable();

    void GetAvailableServers(final Response<ArrayList<ServerInfo>> response);

    void LoginToConnect(String username, String password, final EmptyResponse response)  throws UnsupportedEncodingException, NoSuchAlgorithmException;

    void setWebSocketEnabled(boolean enabled);

    void setReportCapabilitiesEnabled(boolean enabled);

    void CreatePin(String deviceId, Response<PinCreationResult> response);

    void GetPinStatus(PinCreationResult pin, Response<PinStatusResult> response);

    void ExchangePin(PinCreationResult pin, final Response<PinExchangeResult> response);
}
