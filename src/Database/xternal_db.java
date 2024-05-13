package Database;

import javax.swing.ImageIcon;

public class xternal_db {

    private static xternal_db instance;
    private String id, username, email, password, sq, sa, type, status, contact;
    private byte[] pic;
    private ImageIcon image;

    private xternal_db() {

    }

    public ImageIcon getImage() {
        return new ImageIcon(pic);
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String getSq() {
        return sq;
    }

    public void setSq(String sq) {
        this.sq = sq;
    }

    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa;
    }

    public static synchronized xternal_db getInstance() {
        if (instance == null) {
            instance = new xternal_db();
        }
        return instance;
    }

    public static boolean isInstanceEmpty() {
        return instance == null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
