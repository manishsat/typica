package com.xerox.amazonws.fps;

import java.util.Date;

/**
 * @author J. Bernard
 * @author Elastic Grid, LLC.
 * @author jerome.bernard@elastic-grid.com
 */
public class RecurringInstrument implements Instrument {
    private final String tokenId;
    private final Date expiry;
    private final Address address;
    private final Status status;

    public RecurringInstrument(String tokenId, Date expiry, Address address, Status status) {
        this.tokenId = tokenId;
        this.expiry = expiry;
        this.address = address;
        this.status = status;
    }

    public String getTokenId() {
        return tokenId;
    }

    public Date getExpiry() {
        return expiry;
    }

    public Address getAddress() {
        return address;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RecurringInstrument");
        sb.append("{tokenId='").append(tokenId).append('\'');
        sb.append(", expiry='").append(expiry).append('\'');
        sb.append(", address=").append(address);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}