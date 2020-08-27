package lasanha.summertime.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "appuser")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private  String userName;

    private String password;

    private String email;

    private Integer age;

    @ManyToMany
    @JoinTable(name = "user_songs",
            joinColumns = { @JoinColumn(name = "fk_userId") },
            inverseJoinColumns = {@JoinColumn (name = "fk_songId") }
            )
    Set<Song> songs = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return password;
    }

    public void setPassWord(String passWord) {
        this.password = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<Song> getSongs(AppUser user) {
        return user.getSongs(user);
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

}




