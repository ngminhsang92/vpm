package domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Minh Sang on 8/14/2016.
 */

@Entity
public class Task {
    @Id
    @GeneratedValue
    private long id;
    private Status status;
    @OneToMany
    private List<Beneficiary> beneficiaries;
    @OneToOne
    private ResourceType resource;
    @ElementCollection
    private List<byte[]> pictures;
}
