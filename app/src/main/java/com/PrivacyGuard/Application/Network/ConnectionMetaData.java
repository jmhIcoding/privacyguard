package com.PrivacyGuard.Application.Network;

public class ConnectionMetaData {
    public String packageName, appName, srcIP, destIP, destHostName;
    public int srcPort, destPort;

    public ConnectionMetaData(String packageName, String appName, String srcIP, int srcPort, String destIP, int destPort, String destHostName) {
        this.packageName = packageName;
        this.appName = appName;
        this.srcIP = srcIP;
        this.srcPort = srcPort;
        this.destIP = destIP;
        this.destPort = destPort;
        this.destHostName = destHostName;
    }
}
