package com.aisoftware.aisoftware.mapeador;

import com.aisoftware.aisoftware.dto.ImagemDto;
import com.aisoftware.aisoftware.dto.MarcaItemDto;
import com.aisoftware.aisoftware.entidade.Imagem;
import com.aisoftware.aisoftware.entidade.MarcaItem;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",uses = {
        KitMapeador.class
}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ImagemMapeador {

    ImagemDto imagemTomImagemDto(Imagem imagem);

    Imagem imagemDtoToImagem(ImagemDto imagem);
}
