package operations;

import exceptions.*;;

public interface Operation<T> {
	T add(T x, T y) throws OverflowException;

	T sub(T x, T y) throws OverflowException;

	T mul(T x, T y) throws OverflowException;

	T div(T x, T y) throws DivisionByZeroException, OverflowException;

	T neg(T x) throws OverflowException;
	
	T abs(T x) throws OverflowException;
	
	T square(T x) throws OverflowException;
	
	T mod (T x, T y) throws DivisionByZeroException;

	T parseNum(String x) throws ParseConstException;
}
