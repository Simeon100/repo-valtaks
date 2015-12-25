
package com.valtaks.sistema.negocio;

import com.valtaks.sistema.domino.Tipo;

/**
 *
 * @author Simeon
 */
public interface NegocioTipo {
    Tipo proc_tipo_validarExistencia(Tipo tip_obj) throws Exception;
}
