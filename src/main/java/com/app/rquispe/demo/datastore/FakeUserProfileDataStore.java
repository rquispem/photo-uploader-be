package com.app.rquispe.demo.datastore;

import com.app.rquispe.demo.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("3d6b0340-a962-4950-ba65-9b9a16bc41f4"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("55ea8828-6104-43c7-b09b-1e1a38589be1"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
