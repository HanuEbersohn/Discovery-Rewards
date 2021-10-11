package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "MEMBER_TABLE", schema = "AccountDB")
public class MEMBER_TABLE implements Serializable{

    @Id
    @SequenceGenerator(name = "MEMBER_ID_SEQ", sequenceName = "AccountDB.MEMBER_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_ID_SEQ")
    @Column(name = "MEMBER_ID")
    private Long memberID;

    @Column(name = "MEMBER_NAME")
    private String memberName;

    @Column(name = "MILES_AMOUNT")
    private String milesAmount;

    @Column(name = "SERVICE_STARTDATE")
    private LocalDate serviceStartDate;

    public MEMBER_TABLE(long memberID, String memberName, String milesAmount, LocalDate serviceStartDate) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.milesAmount = milesAmount;
        this.serviceStartDate = serviceStartDate;
    }

    public MEMBER_TABLE() {
    }

    public Long getMemberID() {
        return memberID;
    }

    public void setMemberID(long memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMilesAmount() {
        return milesAmount;
    }

    public void setMilesAmount(String milesAmount) {
        this.milesAmount = milesAmount;
    }

    public LocalDate getServiceStartDate() {
        return serviceStartDate;
    }

    public void setServiceStartDate(LocalDate serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MEMBER_TABLE that = (MEMBER_TABLE) o;
        return memberID == that.memberID && Objects.equals(memberName, that.memberName) && Objects.equals(milesAmount, that.milesAmount) && Objects.equals(serviceStartDate, that.serviceStartDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberID, memberName, milesAmount, serviceStartDate);
    }

    @Override
    public String toString() {
        return "MEMBER_TABLE{" +
                "memberID=" + memberID +
                ", memberName='" + memberName + '\'' +
                ", milesAmount='" + milesAmount + '\'' +
                ", serviceStartDate=" + serviceStartDate +
                '}';
    }
}
