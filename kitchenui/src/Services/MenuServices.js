import axios from "axios";

const MENU_ENDPOINT_API="http://localhost:8080/Menu/64c36b63ee0e0982da59a5f5";

class MenuService {
    getMenu(){
        return axios.get(MENU_ENDPOINT_API);
    }
}
export default new MenuService();
