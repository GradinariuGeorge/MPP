package mppcurse.curse.Controlller;

import mppcurse.curse.Model.Curse;
import mppcurse.curse.Model.Request.CursaRequest;
import mppcurse.curse.Repository.CurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursa")
public class CurseController {
    private CurseRepository curseRepository;

    @Autowired
    public CurseController(CurseRepository curseRepository) {
        this.curseRepository = curseRepository;
    }

    @GetMapping("/getAllCurse")
    public List<Curse> getAll(){
        return curseRepository.findAll();
    }
    @PostMapping("/save")
    public void saveCursa(@RequestBody CursaRequest cursaRequest){
        Curse cursa= new Curse();
        cursa.setNrPart(cursaRequest.getNrPart());
        cursa.setId(cursaRequest.getId());
        cursa.setCap(cursaRequest.getCap());
        curseRepository.save(cursa);

    }


    @RequestMapping(value = "/deleteCursa/{Id}", method = RequestMethod.DELETE)
    public void deleteCursa(@PathVariable int Id){
        curseRepository.deleteById(Id);

    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET    )
    public Optional<Curse> getById(@PathVariable int id){
        Optional<Curse> curse= curseRepository.findById(id);
        return curse;

    }
    @PostMapping("/update")
    public void update(@RequestBody CursaRequest cursaRequest){
        curseRepository.deleteById(cursaRequest.getId());
        Curse cursa=new Curse();
        cursa.setId(cursaRequest.getId());
        cursa.setNrPart(cursaRequest.getNrPart());
        cursa.setCap(cursaRequest.getCap());
        curseRepository.save(cursa);
    }
}
