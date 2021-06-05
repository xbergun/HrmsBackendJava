package kodlamaio.Hrms.Services;

import java.io.IOException;

import org.hibernate.mapping.Map;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import com.cloudinary.Cloudinary;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.ErrorDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryManager implements CloudinaryService{
private Cloudinary cloudinary;
	
	public ImageUploadManager() {

		this.cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "dmxsqobs4",
				"api_key", "865586944624325",
				"api_secret", "tsHH5EeXpnhxF93yrnlYyDGBApw"));
	}
	
	@Override
	public DataResult<Map> uploadImageFile(MultipartFile imageFile) {
		try {
			@SuppressWarnings("unchecked")
			Map<String, String> resultMap =(Map<String, String>) cloudinary.uploader().upload(imageFile.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(resultMap);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return new ErrorDataResult<Map>();
	}
}
