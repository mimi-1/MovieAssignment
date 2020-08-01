
package client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for movies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="movies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateRelease" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateUpload" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="movieContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="movieFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="movieName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieSeries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="movieType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "movies", propOrder = {
    "dateRelease",
    "dateUpload",
    "movieContent",
    "movieFilename",
    "movieId",
    "movieName",
    "movieSeries",
    "movieType"
})
public class Movies {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateRelease;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpload;
    protected byte[] movieContent;
    protected String movieFilename;
    protected BigInteger movieId;
    protected String movieName;
    protected String movieSeries;
    protected String movieType;

    /**
     * Gets the value of the dateRelease property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateRelease() {
        return dateRelease;
    }

    /**
     * Sets the value of the dateRelease property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateRelease(XMLGregorianCalendar value) {
        this.dateRelease = value;
    }

    /**
     * Gets the value of the dateUpload property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUpload() {
        return dateUpload;
    }

    /**
     * Sets the value of the dateUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUpload(XMLGregorianCalendar value) {
        this.dateUpload = value;
    }

    /**
     * Gets the value of the movieContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMovieContent() {
        return movieContent;
    }

    /**
     * Sets the value of the movieContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMovieContent(byte[] value) {
        this.movieContent = value;
    }

    /**
     * Gets the value of the movieFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieFilename() {
        return movieFilename;
    }

    /**
     * Sets the value of the movieFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieFilename(String value) {
        this.movieFilename = value;
    }

    /**
     * Gets the value of the movieId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMovieId() {
        return movieId;
    }

    /**
     * Sets the value of the movieId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMovieId(BigInteger value) {
        this.movieId = value;
    }

    /**
     * Gets the value of the movieName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * Sets the value of the movieName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieName(String value) {
        this.movieName = value;
    }

    /**
     * Gets the value of the movieSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieSeries() {
        return movieSeries;
    }

    /**
     * Sets the value of the movieSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieSeries(String value) {
        this.movieSeries = value;
    }

    /**
     * Gets the value of the movieType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovieType() {
        return movieType;
    }

    /**
     * Sets the value of the movieType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovieType(String value) {
        this.movieType = value;
    }

}
