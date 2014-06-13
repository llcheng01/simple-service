package com.example.business.coffee.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: jcheng
 * Date: 6/9/14
 * Time: 6:28 PM
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Bean {
    private String name;
    private RoastType type;
    private String blend;

    public Bean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoastType getType() {
        return type;
    }

    public void setType(RoastType type) {
        this.type = type;
    }

    public String getBlend() {
        return blend;
    }

    public void setBlend(String blend) {
        this.blend = blend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bean)) return false;

        Bean bean = (Bean) o;

        if (!blend.equals(bean.blend)) return false;
        if (!name.equals(bean.name)) return false;
        if (type != bean.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + blend.hashCode();
        return result;
    }
}
