package io.namoosori.travelclub.entity.dto;

import io.namoosori.travelclub.entity.club.CommunityMember;
import io.namoosori.travelclub.entity.club.RoleInClub;
import io.namoosori.travelclub.entity.club.TravelClub;
import io.namoosori.travelclub.util.DateUtil;

public class ClubMembershipDto {
    private String clubId;
    private String memberEmail;
    private RoleInClub role;
    private String joinDate;

    /*create table clubmembership(
        clubId varchar(),
        memberEmail varchar(),
        role RoleInClub,
        joinDate varchar()
    );*/

    public ClubMembershipDto(TravelClub club, CommunityMember member){
        this.clubId = club.getUsid();
        this.memberEmail = member.getEmail();

        this.role = RoleInClub.Member;
        this.joinDate = DateUtil.today();
    }

    public ClubMembershipDto(String clubId, String memberEmail){

        this.clubId = clubId;
        this.memberEmail = memberEmail;

        this.role = RoleInClub.Member;
        this.joinDate = DateUtil.today();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("ClubMembership{");
        builder.append("clubId='").append(clubId).append('\'');
        builder.append(", memberEmail='").append(memberEmail).append('\'');
        builder.append(", role=").append(role);
        builder.append(", joinDate='").append(joinDate).append('\'');
        builder.append('}');
        return builder.toString();
    }

    public String getClubId() {
        return clubId;
    }

    public void setClubId(String clubId) {
        this.clubId = clubId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public RoleInClub getRole() {
        return role;
    }

    public void setRole(RoleInClub role) {
        this.role = role;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
}