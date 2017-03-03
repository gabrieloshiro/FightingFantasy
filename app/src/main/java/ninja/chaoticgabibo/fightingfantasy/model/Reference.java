package ninja.chaoticgabibo.fightingfantasy.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Reference {

    @SerializedName("id")
    private int id;
    @SerializedName("text")
    private String description;
    @SerializedName("references")
    private List<ReferenceDescription> referenceDescriptions;

    public Reference(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ReferenceDescription> getReferenceDescriptions() {
        return referenceDescriptions;
    }

    public void setReferenceDescriptions(List<ReferenceDescription> referenceDescriptions) {
        this.referenceDescriptions = referenceDescriptions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
