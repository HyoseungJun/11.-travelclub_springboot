package io.namoosori.travelclub.store;

import io.namoosori.travelclub.entity.club.ClubMembership;

import java.util.List;

public interface MembershipStore {
    void create(ClubMembership membership);
    public ClubMembership retrieve(String email);
    public List<ClubMembership> retrieveById(String clubId);
    public List<ClubMembership> retrieveByEmail(String memberEmail);
    public void update(ClubMembership membership);
    public void delete(String clubId);

    public boolean exists(String clubId);
}
