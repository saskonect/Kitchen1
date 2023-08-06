import React from "react";
import MenuServices from "../Services/MenuServices";

class MenuComponent extends React.Component{

    componentDidMount() {

        MenuServices.getMenu().then((menuresponse)=>{
            console.log(menuresponse.data)
        });
    }
    render(){
        return (<div></div>)
    }
}
export default MenuComponent;