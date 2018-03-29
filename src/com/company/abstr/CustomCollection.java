package com.company.abstr;

import com.company.impl.Node;

public interface CustomCollection {

	void add(Object data);

	void remove(Object data);

	Node get(Integer index);
}
