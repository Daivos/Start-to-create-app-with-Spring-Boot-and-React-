import React from 'react'
import InstComponent from './InstComponent'

var InstListComponent = (props) => {
    var visosInst = props.visosInst;
    if (visosInst.length === 0) {
        return <div>Cia kazkada bus visos institucijos, kai sulauksim ju is serverio</div>
    } else {
        var instEilutes = visosInst.map((inst) => {
            return <InstComponent key={inst.id} vienaInst={inst} />
        })
        return <div>{instEilutes}</div>
    }
}

export default InstListComponent;