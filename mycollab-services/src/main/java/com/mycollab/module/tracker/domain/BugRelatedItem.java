/*Domain class of table m_tracker_bug_related_item*/
package com.mycollab.module.tracker.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_tracker_bug_related_item")
@Alias("BugRelatedItem")
public class BugRelatedItem extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_bug_related_item.id
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_bug_related_item.bugId
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    @NotNull
    @Column("bugId")
    private Integer bugid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_bug_related_item.type
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    @NotEmpty
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_bug_related_item.typeId
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    @NotNull
    @Column("typeId")
    private Integer typeid;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        BugRelatedItem item = (BugRelatedItem)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(1129, 1713).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_bug_related_item.id
     *
     * @return the value of m_tracker_bug_related_item.id
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug_related_item
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public BugRelatedItem withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_bug_related_item.id
     *
     * @param id the value for m_tracker_bug_related_item.id
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_bug_related_item.bugId
     *
     * @return the value of m_tracker_bug_related_item.bugId
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public Integer getBugid() {
        return bugid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug_related_item
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public BugRelatedItem withBugid(Integer bugid) {
        this.setBugid(bugid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_bug_related_item.bugId
     *
     * @param bugid the value for m_tracker_bug_related_item.bugId
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public void setBugid(Integer bugid) {
        this.bugid = bugid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_bug_related_item.type
     *
     * @return the value of m_tracker_bug_related_item.type
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug_related_item
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public BugRelatedItem withType(String type) {
        this.setType(type);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_bug_related_item.type
     *
     * @param type the value for m_tracker_bug_related_item.type
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_bug_related_item.typeId
     *
     * @return the value of m_tracker_bug_related_item.typeId
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_tracker_bug_related_item
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public BugRelatedItem withTypeid(Integer typeid) {
        this.setTypeid(typeid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_bug_related_item.typeId
     *
     * @param typeid the value for m_tracker_bug_related_item.typeId
     *
     * @mbg.generated Sat Feb 09 11:42:27 CST 2019
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public enum Field {
        id,
        bugid,
        type,
        typeid;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}