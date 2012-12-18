/**
 * Eine Backware, die von der Baeckerei verkauft wird.
 */
public abstract class Backware {
	/**
	 * Liefert eine neue Backware mit den selben Eigenschaften wie diese
	 * Backware. Der Typ der erzeugten Backware stimmt mit dem Typ dieser
	 * Backware ueberein.
	 */
	protected abstract Backware backen();
}
