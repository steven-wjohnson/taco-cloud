package com.stevenjohnson.tacocloud.domain;

import java.util.ArrayList;
import java.util.List;

public class TacoOrder {

    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    private List<Taco> tacos = new ArrayList<>();

    public TacoOrder(){}

    public TacoOrder(String deliveryName, String deliveryStreet, String deliveryCity, String deliveryState,
            String deliveryZip, String ccNumber, String ccExpiration, String ccCVV, List<Taco> tacos) {
        this.deliveryName = deliveryName;
        this.deliveryStreet = deliveryStreet;
        this.deliveryCity = deliveryCity;
        this.deliveryState = deliveryState;
        this.deliveryZip = deliveryZip;
        this.ccNumber = ccNumber;
        this.ccExpiration = ccExpiration;
        this.ccCVV = ccCVV;
        this.tacos = tacos;
    }

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public String getDeliveryStreet() {
        return deliveryStreet;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public String getDeliveryZip() {
        return deliveryZip;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public String getCcExpiration() {
        return ccExpiration;
    }

    public String getCcCVV() {
        return ccCVV;
    }

    public List<Taco> getTacos() {
        return tacos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((deliveryName == null) ? 0 : deliveryName.hashCode());
        result = prime * result + ((deliveryStreet == null) ? 0 : deliveryStreet.hashCode());
        result = prime * result + ((deliveryCity == null) ? 0 : deliveryCity.hashCode());
        result = prime * result + ((deliveryState == null) ? 0 : deliveryState.hashCode());
        result = prime * result + ((deliveryZip == null) ? 0 : deliveryZip.hashCode());
        result = prime * result + ((ccNumber == null) ? 0 : ccNumber.hashCode());
        result = prime * result + ((ccExpiration == null) ? 0 : ccExpiration.hashCode());
        result = prime * result + ((ccCVV == null) ? 0 : ccCVV.hashCode());
        result = prime * result + ((tacos == null) ? 0 : tacos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TacoOrder other = (TacoOrder) obj;
        if (deliveryName == null) {
            if (other.deliveryName != null)
                return false;
        } else if (!deliveryName.equals(other.deliveryName))
            return false;
        if (deliveryStreet == null) {
            if (other.deliveryStreet != null)
                return false;
        } else if (!deliveryStreet.equals(other.deliveryStreet))
            return false;
        if (deliveryCity == null) {
            if (other.deliveryCity != null)
                return false;
        } else if (!deliveryCity.equals(other.deliveryCity))
            return false;
        if (deliveryState == null) {
            if (other.deliveryState != null)
                return false;
        } else if (!deliveryState.equals(other.deliveryState))
            return false;
        if (deliveryZip == null) {
            if (other.deliveryZip != null)
                return false;
        } else if (!deliveryZip.equals(other.deliveryZip))
            return false;
        if (ccNumber == null) {
            if (other.ccNumber != null)
                return false;
        } else if (!ccNumber.equals(other.ccNumber))
            return false;
        if (ccExpiration == null) {
            if (other.ccExpiration != null)
                return false;
        } else if (!ccExpiration.equals(other.ccExpiration))
            return false;
        if (ccCVV == null) {
            if (other.ccCVV != null)
                return false;
        } else if (!ccCVV.equals(other.ccCVV))
            return false;
        if (tacos == null) {
            if (other.tacos != null)
                return false;
        } else if (!tacos.equals(other.tacos))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TacoOrder [deliveryName=" + deliveryName + ", deliveryStreet=" + deliveryStreet + ", deliveryCity="
                + deliveryCity + ", deliveryState=" + deliveryState + ", deliveryZip=" + deliveryZip + ", ccNumber="
                + ccNumber + ", ccExpiration=" + ccExpiration + ", ccCVV=" + ccCVV + ", tacos=" + tacos + "]";
    }

}
