/* Generated By:JJTree: Do not edit this line. OUpdateStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OUpdateStatement extends OStatement {
  protected ORid                    targetRid;
  protected OIdentifier             targetClass;
  protected OCluster                targetCluster;
  protected OIndexIdentifier        targetIndex;
  protected OStatement              targetQuery;

  protected List<OUpdateOperations> operations   = new ArrayList<OUpdateOperations>();

  protected boolean                 upsert       = false;

  protected boolean                 returnBefore = false;
  protected boolean                 returnAfter  = false;
  protected OProjection             returnProjection;

  protected OWhereClause            whereClause;

  protected boolean                 lockRecord   = false;

  protected OLimit                  limit;
  protected OTimeout                  timeout;

  public OUpdateStatement(int id) {
    super(id);
  }

  public OUpdateStatement(OrientSql p, int id) {
    super(p, id);
  }

  public void toString(Map<Object, Object> params, StringBuilder builder) {
    builder.append("UPDATE ");
    if (targetRid != null) {
      targetRid.toString(params, builder);
    } else if (targetClass != null) {
      targetClass.toString(params, builder);
    } else if (targetCluster != null) {
      targetCluster.toString(params, builder);
    } else if (targetIndex != null) {
      targetIndex.toString(params, builder);
    } else if (targetQuery != null) {
      builder.append("(");
      targetQuery.toString(params, builder);
      builder.append(")");
    }

    for (OUpdateOperations ops : this.operations) {
      builder.append(" ");
      ops.toString(params, builder);
    }

    if (upsert) {
      builder.append(" UPSERT");
    }

    if (returnBefore || returnAfter) {
      builder.append(" RETURN");
      if (returnBefore) {
        builder.append(" BEFORE");
      } else {
        builder.append(" AFTER");
      }
      if (returnProjection != null) {
        builder.append(" ");
        returnProjection.toString(params, builder);
      }
    }
    if (whereClause != null) {
      builder.append(" WHERE ");
      whereClause.toString(params, builder);
    }

    if (lockRecord) {
      builder.append(" LOCK RECORD");
    }
    if (limit != null) {
      limit.toString(params, builder);
    }
    if (timeout != null) {
      timeout.toString(params, builder);
    }
  }


}
/* JavaCC - OriginalChecksum=093091d7273f1073ad49f2a2bf709a53 (do not edit this line) */
