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
    //Important note: video1, video2, clip1, clip2 should have 1 redacted video
    //Video:
    static String video1 = "autotestvideo1.AVI";
    static String video2 = "autotestvideo2.AVI";

    //File:
    static String file1 = "autotestfile1.TXT";
    static String file2 = "autotestfile2.TXT";

    //Clip:
    static String clip1 = "autotestvideo1_CLIP-001.mp4";
    static String clip2 = "autotestvideo2_CLIP-001.mp4";
}
