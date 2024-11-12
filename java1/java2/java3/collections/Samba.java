package java1.java2.java3.collections;
    import java.util.ArrayList;
import java.util.List;

interface Profile {
    void details();
}

class UserProfile implements Profile {

    @Override
    public void details() {
        System.out.println("Details Of User");
    }

}

class ManagerProfile implements Profile {

    @Override
    public void details() {
        System.out.println("Manager Details");
    }

}

class My3Tech<T> {
    T profile;
}

public class Samba {

    public static void main(String[] args) {
        UserProfile up1 = new UserProfile();
        ManagerProfile mp1 = new ManagerProfile();

        My3Tech<UserProfile> m1 = new My3Tech<>();
        m1.profile = up1;
        m1.profile.details();
        My3Tech<ManagerProfile> m2 = new My3Tech<>();
        m2.profile = mp1;
    }
}

