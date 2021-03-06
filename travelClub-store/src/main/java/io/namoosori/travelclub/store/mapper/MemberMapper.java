package io.namoosori.travelclub.store.mapper;

import io.namoosori.travelclub.entity.club.CommunityMember;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public String create(CommunityMember member);
    public CommunityMember retrieve(String email);
    public List<CommunityMember> retrieveByName(String name);
    public void update(CommunityMember member);
    public void delete(String email);

    public boolean exists(String email);
}
