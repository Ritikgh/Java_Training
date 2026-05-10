interface Login {
    boolean authenticate(String username, String password);
}

class GoogleLogin implements Login {

    public boolean authenticate(String username, String password) {

        if (username.equals("googleUser") &&
                password.equals("google123")) {

            System.out.println("Google Login Successful");
            return true;
        } else {
            System.out.println("Google Login Failed");
            return false;
        }
    }
}

class FacebookLogin implements Login {

    public boolean authenticate(String username, String password) {

        if (username.equals("facebookUser") &&
                password.equals("fb123")) {

            System.out.println("Facebook Login Successful");
            return true;
        } else {
            System.out.println("Facebook Login Failed");
            return false;
        }
    }
}

class OTPLogin implements Login {

    public boolean authenticate(String username, String password) {

        if (username.equals("Ritik") &&
                password.equals("1234")) {

            System.out.println("OTP Login Successful");
            return true;
        } else {
            System.out.println("Invalid OTP");
            return false;
        }
    }
}

class Main {
    public static void main(String[] args) {

        Login l1 = new GoogleLogin();
        l1.authenticate("googleUser", "google123");

        Login l2 = new FacebookLogin();
        l2.authenticate("facebookUser", "wrongpass");

        Login l3 = new OTPLogin();
        l3.authenticate("Ritik", "1234");
    }
}