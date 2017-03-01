package ninja.chaoticgabibo.fightingfantasy.model;

import com.google.gson.annotations.SerializedName;

public class ReferenceDescription {

    @SerializedName("description")
    String description;
    @SerializedName("reference")
    int referenceId;

    Reference referenceObj;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Reference getReference() {
        return referenceObj;
    }

    public void setReference(Reference reference) {
        this.referenceObj = reference;
    }

    public int getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(int referenceId) {
        this.referenceId = referenceId;
    }
}
