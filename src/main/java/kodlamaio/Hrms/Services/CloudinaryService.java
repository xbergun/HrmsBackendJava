package kodlamaio.Hrms.Services;

public interface CloudinaryService {
	DataResult<Map> uploadImageFile(MultipartFile imageFile);
}
