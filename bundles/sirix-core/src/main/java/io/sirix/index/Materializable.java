package io.sirix.index;

import io.brackit.query.jdm.DocumentException;
import io.brackit.query.jdm.node.Node;

/**
 * Materializable structure.
 * 
 * @author Sebastian Baechle
 *
 */
public interface Materializable {
  /**
   * Materialize the object as a {@link Node} tree
   * 
   * @return the root of the materialized tree
   * @throws DocumentException if materialization fails
   */
  Node<?> materialize();

  /**
   * Initializes the materialized locator facet
   * 
   * @param root root of the materialized facet subtree
   * @throws DocumentException if initialization fails
   */
  void init(Node<?> root);
}
