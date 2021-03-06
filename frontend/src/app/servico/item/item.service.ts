import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';

@Injectable()
export class ItemService {

    url = 'http://localhost:8080' + '/item';
    httpHeader = new HttpHeaders();

    constructor(
        private httpCliente: HttpClient) {
        this.httpHeader = this.httpHeader.append('Content-Type', 'application/json');
    }
}