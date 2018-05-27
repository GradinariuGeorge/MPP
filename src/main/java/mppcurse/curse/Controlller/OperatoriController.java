//package mppcurse.curse.Controlller;
//
//import mppcurse.curse.Model.Operatori;
//import mppcurse.curse.Model.Request.AddOperatorRequest;
//import mppcurse.curse.Repository.OperatoriRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class OperatoriController {
//    private OperatoriRepository operatoriRepository;
//
//    @Autowired
//    public OperatoriController(OperatoriRepository operatoriRepository) {
//        this.operatoriRepository = operatoriRepository;
//    }
//    @RequestMapping(method = RequestMethod.POST)
//    public void addOperatori(@RequestBody AddOperatorRequest addOperatorRequest){
//        Operatori operator=new Operatori();
//        operator.setId(addOperatorRequest.getId());
//        operator.setNume(addOperatorRequest.getNume());
//        operator.setUser(addOperatorRequest.getUser());
//        operator.setPass(addOperatorRequest.getPass());
//        operatoriRepository.save(operator);
//    }
//    @RequestMapping(method = RequestMethod.GET)
//    public List<Operatori> getOperatori(){
//        return operatoriRepository.findAll();
//    }
//}
//
