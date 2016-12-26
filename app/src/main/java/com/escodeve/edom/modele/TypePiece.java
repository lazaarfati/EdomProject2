package com.escodeve.edom.modele;

import java.util.List;

/**
 * Created by bouza on 8/1/2016.
 */
public class TypePiece {
    private int id;
    private String libeleTypePiece;

    private List<Piece>Pieces;
    public TypePiece() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibeleTypePiece() {
        return libeleTypePiece;
    }

    public void setLibeleTypePiece(String libeleTypePiece) {
        this.libeleTypePiece = libeleTypePiece;
    }

    public TypePiece(int id, String libeleTypePiece) {
        this.id = id;
        this.libeleTypePiece = libeleTypePiece;
    }

    public List<Piece> getPieces() {
        return Pieces;
    }

    public void setPieces(List<Piece> pieces) {
        Pieces = pieces;
    }

}
