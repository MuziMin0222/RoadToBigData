package com.muzimin.reverse.entity;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.name
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.age
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    private String age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.gender
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    private String gender;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.name
     *
     * @return the value of t_user.name
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.name
     *
     * @param name the value for t_user.name
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.age
     *
     * @return the value of t_user.age
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    public String getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.age
     *
     * @param age the value for t_user.age
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.gender
     *
     * @return the value of t_user.gender
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.gender
     *
     * @param gender the value for t_user.gender
     *
     * @mbggenerated Fri Mar 22 17:51:30 CST 2024
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}