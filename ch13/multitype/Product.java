package ch13.multitype;

public class Product<T, M> {

	// 필
	private T kind;  // Car, Tv
	private M model;

	// 생

	// 메

	public T getKind() {
		return kind;
	}

	public M getModel() {
		return model;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}

}