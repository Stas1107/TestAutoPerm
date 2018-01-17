package Solution;

class Data {
    //Subscription:
    static  String subscription = "https://securitytest.vievusolution.com";

    //User who shares:
    static String user1 = "Adam1"; //User 1 login
    static String pass1 = "vievu123"; //User 1 password

    //User with whom will be shared:
    //Note: No any video/file should be shared with this user
    static String user2 = "Adam2"; //User 2 login
    static String pass2 = "vievu123"; //User 2 password
    static String group2 = "Adam2g"; //User 2 is member of this group

    //Here will be the test files (files with this names should present on the web site and uploaded by user1)
    //Important note: video, clip, should have 1 redacted video
    //Video:
    static String video = "autotestvideo1.AVI";

    //File:
    static String file = "autotestfile1.TXT";

    //Clip:
    static String clip = "autotestvideo1_CLIP-001.mp4";
}
