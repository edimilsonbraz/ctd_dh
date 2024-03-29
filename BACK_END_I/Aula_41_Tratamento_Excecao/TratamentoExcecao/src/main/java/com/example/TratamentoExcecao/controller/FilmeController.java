package com.example.TratamentoExcecao.controller;

import com.example.TratamentoExcecao.exceptions.BadRequestException;
import com.example.TratamentoExcecao.exceptions.ResourceNotFoundException;
import com.example.TratamentoExcecao.model.FilmeModel;
import com.example.TratamentoExcecao.service.FilmeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @PostMapping
    public ResponseEntity<FilmeModel> salvar(@RequestBody FilmeModel filmeModel) throws BadRequestException {
        return ResponseEntity.ok(filmeService.salvar(filmeModel));
    }

    @GetMapping
    public List<FilmeModel> buscarTodos(){
        return filmeService.buscarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FilmeModel> buscarFilmes(@PathVariable Integer id) throws ResourceNotFoundException {
        try{
            return ResponseEntity.ok(filmeService.buscarId(id));
        }catch (Exception e){
           throw new ResourceNotFoundException("Não foi encontrado o filme para buscar o id " + id);
        }
    }

    @PutMapping
    public ResponseEntity<FilmeModel> atualizarFilme(@RequestBody FilmeModel filmeModel){
        return ResponseEntity.ok(filmeService.atualizar(filmeModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Integer id) throws ResourceNotFoundException{
        try {
            filmeService.deletar(id);
            return ResponseEntity.ok("Deletado");
        }catch (Exception e){
           throw new ResourceNotFoundException("Não foi encontrado o filme para deletar de id " + id);
        }
    }

    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity<String> processarErrorBadRequest(BadRequestException ex){
        return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
