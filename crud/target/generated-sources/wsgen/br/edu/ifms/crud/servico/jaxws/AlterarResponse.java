
package br.edu.ifms.crud.servico.jaxws;

import br.edu.ifms.crud.modelo.Noticia;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "alterarResponse", namespace = "http://servico.crud.ifms.edu.br/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarResponse", namespace = "http://servico.crud.ifms.edu.br/")
public class AlterarResponse {

    @XmlElement(name = "return", namespace = "")
    private Noticia _return;

    /**
     * 
     * @return
     *     returns Noticia
     */
    public Noticia getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(Noticia _return) {
        this._return = _return;
    }

}
