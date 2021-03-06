package mediabrowser.apiinteraction.sync;

import mediabrowser.apiinteraction.ConnectionResult;
import mediabrowser.apiinteraction.Response;
import mediabrowser.apiinteraction.tasks.CancellationToken;
import mediabrowser.model.apiclient.ConnectionState;
import mediabrowser.model.apiclient.ServerInfo;

public class ServerSyncConnectionResponse extends Response<ConnectionResult> {

    private ServerSync serverSync;
    private ServerInfo server;
    private CancellationToken cancellationToken;
    private SyncProgress progress;

    public ServerSyncConnectionResponse(ServerSync serverSync, ServerInfo server, CancellationToken cancellationToken, SyncProgress progress) {
        this.serverSync = serverSync;
        this.server = server;
        this.cancellationToken = cancellationToken;
        this.progress = progress;
    }

    @Override
    public void onResponse(ConnectionResult result) {

        if (result.getState() == ConnectionState.SignedIn) {

            serverSync.Sync(server, result.getApiClient(), cancellationToken, progress);

        } else {

            serverSync.LogNoAuthentication(server);

            // Done. Nothing to do.
            progress.reportComplete();
        }
    }
}
