/*
 * This up.god.file is generated by jOOQ.
 */
package up.god.domain;


import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import up.god.domain.tables.SysTabular;
import up.god.domain.tables.records.SysTabularRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of
 * the <code>DB_ZERO</code> schema.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.8"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<SysTabularRecord> KEY_SYS_TABULAR_PRIMARY = UniqueKeys0.KEY_SYS_TABULAR_PRIMARY;
    public static final UniqueKey<SysTabularRecord> KEY_SYS_TABULAR_UK_SYS_TABULAR_S_CODE_S_TYPE_Z_SIGMA_Z_LANGUAGE = UniqueKeys0.KEY_SYS_TABULAR_UK_SYS_TABULAR_S_CODE_S_TYPE_Z_SIGMA_Z_LANGUAGE;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<SysTabularRecord> KEY_SYS_TABULAR_PRIMARY = Internal.createUniqueKey(SysTabular.SYS_TABULAR, "KEY_SYS_TABULAR_PRIMARY", SysTabular.SYS_TABULAR.PK_ID);
        public static final UniqueKey<SysTabularRecord> KEY_SYS_TABULAR_UK_SYS_TABULAR_S_CODE_S_TYPE_Z_SIGMA_Z_LANGUAGE = Internal.createUniqueKey(SysTabular.SYS_TABULAR, "KEY_SYS_TABULAR_UK_SYS_TABULAR_S_CODE_S_TYPE_Z_SIGMA_Z_LANGUAGE", SysTabular.SYS_TABULAR.S_CODE, SysTabular.SYS_TABULAR.S_TYPE, SysTabular.SYS_TABULAR.Z_SIGMA, SysTabular.SYS_TABULAR.Z_LANGUAGE);
    }
}
