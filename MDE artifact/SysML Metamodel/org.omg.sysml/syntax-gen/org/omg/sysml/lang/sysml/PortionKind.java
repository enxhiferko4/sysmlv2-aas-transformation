/**
 */
package org.omg.sysml.lang.sysml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Portion Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p><code>PortionKind</code> is an enumeration of the specific kinds of <code><em>Occurrence</em></code> portions that can be represented by an <code>OccurrenceUsage</code>.</p>
 * <!-- end-model-doc -->
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortionKind()
 * @model
 * @generated
 */
public enum PortionKind implements Enumerator {
	/**
	 * The '<em><b>Timeslice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A time slice of an <code>Occurrence</code> (a portion over time).</p>
	 * <!-- end-model-doc -->
	 * @see #TIMESLICE_VALUE
	 * @generated
	 * @ordered
	 */
	TIMESLICE(0, "timeslice", "timeslice"),

	/**
	 * The '<em><b>Snapshot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A snapshot of an <code>Occurrence</code> (a time slice with zero duration).</p>
	 * <!-- end-model-doc -->
	 * @see #SNAPSHOT_VALUE
	 * @generated
	 * @ordered
	 */
	SNAPSHOT(1, "snapshot", "snapshot");

	/**
	 * The '<em><b>Timeslice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A time slice of an <code>Occurrence</code> (a portion over time).</p>
	 * <!-- end-model-doc -->
	 * @see #TIMESLICE
	 * @model name="timeslice"
	 * @generated
	 * @ordered
	 */
	public static final int TIMESLICE_VALUE = 0;

	/**
	 * The '<em><b>Snapshot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A snapshot of an <code>Occurrence</code> (a time slice with zero duration).</p>
	 * <!-- end-model-doc -->
	 * @see #SNAPSHOT
	 * @model name="snapshot"
	 * @generated
	 * @ordered
	 */
	public static final int SNAPSHOT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Portion Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PortionKind[] VALUES_ARRAY =
		new PortionKind[] {
			TIMESLICE,
			SNAPSHOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Portion Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PortionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Portion Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Portion Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PortionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Portion Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PortionKind get(int value) {
		switch (value) {
			case TIMESLICE_VALUE: return TIMESLICE;
			case SNAPSHOT_VALUE: return SNAPSHOT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PortionKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PortionKind
