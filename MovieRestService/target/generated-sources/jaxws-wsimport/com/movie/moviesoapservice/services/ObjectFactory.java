
package com.movie.moviesoapservice.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.movie.moviesoapservice.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hello_QNAME = new QName("http://services.moviesoapservice.movie.com/", "hello");
    private final static QName _UpdateMovie_QNAME = new QName("http://services.moviesoapservice.movie.com/", "updateMovie");
    private final static QName _DownloadResponse_QNAME = new QName("http://services.moviesoapservice.movie.com/", "downloadResponse");
    private final static QName _GetMovieListResponse_QNAME = new QName("http://services.moviesoapservice.movie.com/", "getMovieListResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://services.moviesoapservice.movie.com/", "helloResponse");
    private final static QName _GetMovieResponse_QNAME = new QName("http://services.moviesoapservice.movie.com/", "getMovieResponse");
    private final static QName _Movies_QNAME = new QName("http://services.moviesoapservice.movie.com/", "movies");
    private final static QName _Download_QNAME = new QName("http://services.moviesoapservice.movie.com/", "download");
    private final static QName _Exception_QNAME = new QName("http://services.moviesoapservice.movie.com/", "Exception");
    private final static QName _DeleteMovieResponse_QNAME = new QName("http://services.moviesoapservice.movie.com/", "deleteMovieResponse");
    private final static QName _UploadResponse_QNAME = new QName("http://services.moviesoapservice.movie.com/", "uploadResponse");
    private final static QName _NonexistentEntityException_QNAME = new QName("http://services.moviesoapservice.movie.com/", "NonexistentEntityException");
    private final static QName _GetMovieList_QNAME = new QName("http://services.moviesoapservice.movie.com/", "getMovieList");
    private final static QName _GetMovie_QNAME = new QName("http://services.moviesoapservice.movie.com/", "getMovie");
    private final static QName _Upload_QNAME = new QName("http://services.moviesoapservice.movie.com/", "upload");
    private final static QName _DeleteMovie_QNAME = new QName("http://services.moviesoapservice.movie.com/", "deleteMovie");
    private final static QName _UpdateMovieResponse_QNAME = new QName("http://services.moviesoapservice.movie.com/", "updateMovieResponse");
    private final static QName _IllegalOrphanException_QNAME = new QName("http://services.moviesoapservice.movie.com/", "IllegalOrphanException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.movie.moviesoapservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateMovieResponse }
     * 
     */
    public UpdateMovieResponse createUpdateMovieResponse() {
        return new UpdateMovieResponse();
    }

    /**
     * Create an instance of {@link IllegalOrphanException }
     * 
     */
    public IllegalOrphanException createIllegalOrphanException() {
        return new IllegalOrphanException();
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link DeleteMovie }
     * 
     */
    public DeleteMovie createDeleteMovie() {
        return new DeleteMovie();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link NonexistentEntityException }
     * 
     */
    public NonexistentEntityException createNonexistentEntityException() {
        return new NonexistentEntityException();
    }

    /**
     * Create an instance of {@link GetMovieList }
     * 
     */
    public GetMovieList createGetMovieList() {
        return new GetMovieList();
    }

    /**
     * Create an instance of {@link GetMovie }
     * 
     */
    public GetMovie createGetMovie() {
        return new GetMovie();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link DeleteMovieResponse }
     * 
     */
    public DeleteMovieResponse createDeleteMovieResponse() {
        return new DeleteMovieResponse();
    }

    /**
     * Create an instance of {@link GetMovieResponse }
     * 
     */
    public GetMovieResponse createGetMovieResponse() {
        return new GetMovieResponse();
    }

    /**
     * Create an instance of {@link Movies }
     * 
     */
    public Movies createMovies() {
        return new Movies();
    }

    /**
     * Create an instance of {@link Download }
     * 
     */
    public Download createDownload() {
        return new Download();
    }

    /**
     * Create an instance of {@link UpdateMovie }
     * 
     */
    public UpdateMovie createUpdateMovie() {
        return new UpdateMovie();
    }

    /**
     * Create an instance of {@link DownloadResponse }
     * 
     */
    public DownloadResponse createDownloadResponse() {
        return new DownloadResponse();
    }

    /**
     * Create an instance of {@link GetMovieListResponse }
     * 
     */
    public GetMovieListResponse createGetMovieListResponse() {
        return new GetMovieListResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "updateMovie")
    public JAXBElement<UpdateMovie> createUpdateMovie(UpdateMovie value) {
        return new JAXBElement<UpdateMovie>(_UpdateMovie_QNAME, UpdateMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "downloadResponse")
    public JAXBElement<DownloadResponse> createDownloadResponse(DownloadResponse value) {
        return new JAXBElement<DownloadResponse>(_DownloadResponse_QNAME, DownloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "getMovieListResponse")
    public JAXBElement<GetMovieListResponse> createGetMovieListResponse(GetMovieListResponse value) {
        return new JAXBElement<GetMovieListResponse>(_GetMovieListResponse_QNAME, GetMovieListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "getMovieResponse")
    public JAXBElement<GetMovieResponse> createGetMovieResponse(GetMovieResponse value) {
        return new JAXBElement<GetMovieResponse>(_GetMovieResponse_QNAME, GetMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "movies")
    public JAXBElement<Movies> createMovies(Movies value) {
        return new JAXBElement<Movies>(_Movies_QNAME, Movies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Download }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "download")
    public JAXBElement<Download> createDownload(Download value) {
        return new JAXBElement<Download>(_Download_QNAME, Download.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "deleteMovieResponse")
    public JAXBElement<DeleteMovieResponse> createDeleteMovieResponse(DeleteMovieResponse value) {
        return new JAXBElement<DeleteMovieResponse>(_DeleteMovieResponse_QNAME, DeleteMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "uploadResponse")
    public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
        return new JAXBElement<UploadResponse>(_UploadResponse_QNAME, UploadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonexistentEntityException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "NonexistentEntityException")
    public JAXBElement<NonexistentEntityException> createNonexistentEntityException(NonexistentEntityException value) {
        return new JAXBElement<NonexistentEntityException>(_NonexistentEntityException_QNAME, NonexistentEntityException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "getMovieList")
    public JAXBElement<GetMovieList> createGetMovieList(GetMovieList value) {
        return new JAXBElement<GetMovieList>(_GetMovieList_QNAME, GetMovieList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "getMovie")
    public JAXBElement<GetMovie> createGetMovie(GetMovie value) {
        return new JAXBElement<GetMovie>(_GetMovie_QNAME, GetMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "upload")
    public JAXBElement<Upload> createUpload(Upload value) {
        return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMovie }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "deleteMovie")
    public JAXBElement<DeleteMovie> createDeleteMovie(DeleteMovie value) {
        return new JAXBElement<DeleteMovie>(_DeleteMovie_QNAME, DeleteMovie.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMovieResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "updateMovieResponse")
    public JAXBElement<UpdateMovieResponse> createUpdateMovieResponse(UpdateMovieResponse value) {
        return new JAXBElement<UpdateMovieResponse>(_UpdateMovieResponse_QNAME, UpdateMovieResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IllegalOrphanException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.moviesoapservice.movie.com/", name = "IllegalOrphanException")
    public JAXBElement<IllegalOrphanException> createIllegalOrphanException(IllegalOrphanException value) {
        return new JAXBElement<IllegalOrphanException>(_IllegalOrphanException_QNAME, IllegalOrphanException.class, null, value);
    }

}
