package fpoly.learn.springbootms.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "news")
public class NewEntity extends BaseEntity{
    @Column(name = "title")
    private String title;
    @Column(name = "thumbnail")
    private String thumbnail;
    @Column(name = "shortDescription")
    private String shortDescription;
    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

}
