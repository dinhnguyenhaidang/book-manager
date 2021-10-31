package com.b1704721.bookmanager.service;

import com.b1704721.bookmanager.dto.AuthorDTO;

/**
 * Follows template for Data Injection
 *
 * @author B1704721
 * @version 1.0
 * @since 15-Sep-2021
 */
public interface IAuthorService {

    AuthorDTO getRecordById(long authorId);

    AuthorDTO saveRecord(AuthorDTO authorDTO);

    AuthorDTO updateRecord(AuthorDTO authorDTO);

    void deleteRecordById(long authorId) throws Exception;

}
