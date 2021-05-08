package com.app.rquispe.demo.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
    private final UUID userProfileId;
    private final String userName;
    private String profileImageLink; // S3 key

    public UserProfile(UUID userProfileId, String userName, String profileImageLink) {
        this.userProfileId = userProfileId;
        this.userName = userName;
        this.profileImageLink = profileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public String getUserName() {
        return userName;
    }

    public Optional<String> getProfileImageLink() {
        return Optional.ofNullable(profileImageLink);
    }

    public void setProfileImageLink(String profileImageLink) {
        this.profileImageLink = profileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(userProfileId, that.userProfileId) && Objects.equals(userName,that.userName) && Objects.equals(profileImageLink, that.profileImageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userProfileId, userName, profileImageLink);
    }
}
