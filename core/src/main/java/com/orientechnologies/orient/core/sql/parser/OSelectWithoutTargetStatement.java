/* Generated By:JJTree: Do not edit this line. OSelectWithoutTargetStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

public
class OSelectWithoutTargetStatement extends SimpleNode {
  public OSelectWithoutTargetStatement(int id) {
    super(id);
  }

  public OSelectWithoutTargetStatement(OrientSql p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=2b0c73e32d84e559188b75251a4d262c (do not edit this line) */