package com.redhat.utils;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

/**
 * <a href="OrderedProperties.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 */
public class OrderedProperties extends Properties {

    public OrderedProperties() {
        super();

        _names = new Vector();
    }

    public Enumeration propertyNames() {
        return _names.elements();
    }

    public Object put(Object key, Object value) {
        _names.remove(key);

        _names.add(key);

        return super.put(key, value);
    }

    public Object remove(Object key) {
        _names.remove(key);

        return super.remove(key);
    }

    private final Vector _names;

    @Override
    public boolean equals(Object that) {
        return super.equals(that);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
