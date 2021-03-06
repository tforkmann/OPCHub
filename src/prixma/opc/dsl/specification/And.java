package prixma.opc.dsl.specification;

import prixma.opc.dsl.criteria.Criteria;

public class And implements Specification {

	@Override
	public boolean match(Criteria one, Criteria other) {
		return one.match() && other.match();
	}

}
