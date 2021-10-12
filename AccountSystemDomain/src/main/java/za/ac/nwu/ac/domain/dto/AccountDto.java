package za.ac.nwu.ac.domain.dto;

import za.ac.nwu.ac.domain.persistence.MEMBER_TABLE;

import java.io.Serializable;
import java.time.LocalDate;

public class AccountDto implements Serializable {

    private String memberName;
    private String milesAmount;
    private LocalDate serviceStartDate;

    public AccountDto() {
    }

    public AccountDto(String memberName, String milesAmount, LocalDate serviceStartDate) {
        this.memberName = memberName;
        this.milesAmount = milesAmount;
        this.serviceStartDate = serviceStartDate;
    }

    public AccountDto(MEMBER_TABLE memberT)
    {
        this.setMemberName(memberT.getMemberName());
        this.setMilesAmount(memberT.getMilesAmount());
        this.setServiceStartDate(memberT.getServiceStartDate());
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
}
